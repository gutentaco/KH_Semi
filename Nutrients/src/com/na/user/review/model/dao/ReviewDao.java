package com.na.user.review.model.dao;

import static com.na.template.JDBCTemplate.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

import com.na.template.model.vo.PageInfo;
import com.na.user.member.model.dao.MemberDao;
import com.na.user.product.model.vo.Product;
import com.na.user.review.model.vo.Review;

public class ReviewDao {
	
	private Properties prop = new Properties();
	
	public ReviewDao() {


		String fileName = MemberDao.class.getResource("/sql/review/review-mapper.xml").getPath();
				
		try {
			prop.loadFromXML(new FileInputStream(fileName));
					
		} catch (InvalidPropertiesFormatException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public int selectMyReviewCount(Connection conn, int userNo) {
		
		int listCount = 0;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String sql = prop.getProperty("selectMyReviewCount");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, userNo);
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				listCount = rset.getInt(1);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		return listCount;		
	}
	
	public ArrayList<Review> selectMyReviewList(Connection conn, PageInfo pi, int userNo){
		
		ArrayList<Review> list = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("selectMyReviewList");
		try {
			pstmt = conn.prepareStatement(sql);

			
			int startRow = (pi.getCurrentPage() - 1)* pi.getBoardLimit() + 1;
			int endRow = startRow + pi.getBoardLimit() - 1;
			
			pstmt.setInt(1, userNo);
			pstmt.setInt(2, startRow);
			pstmt.setInt(3, endRow);
			rset = pstmt.executeQuery();
//			REVIEW_NO, REVIEW_TITLE, MEM_ID, TO_CHAR(REVIEW_DATE, 'YYYYMMDD') D
			while(rset.next()) {
				list.add(new Review(
						rset.getInt("REVIEW_NO")
					  , rset.getString("REVIEW_TITLE")
					  , rset.getString("D")
					  , rset.getString("MEM_ID")
						));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		return list;	
		
		
	}
	// 리뷰 현재 게시글 갯수	
			public int selectListCount(Connection conn) {
		// SELECT 문 => ResultSet 객체 ( 한개의 행)
		
				int listCount = 0;
				
				PreparedStatement pstmt = null;
				ResultSet rset = null;
				
				String sql = prop.getProperty("selectListCount");
				
				
				try {
					pstmt = conn.prepareStatement(sql);
					
					rset = pstmt.executeQuery();
					
					if(rset.next()) {
						
						listCount = rset.getInt("COUNT");
					}
					
				} catch (SQLException e) {
					e.printStackTrace();
				}finally {
					
				    close(rset);
					close(pstmt);
				}
				
				return listCount;				
		}		
			//현재 사용자가 요청한 페이지에 보여질 게시글 리스트 	
			public ArrayList<Review> selectList(Connection conn,PageInfo pi){
				
				// SELECT문 => ResultSet 객체 (여러 행 조회) => ArrayList
				
				ArrayList<Review> list = new ArrayList<>();
				
				PreparedStatement pstmt = null;
				ResultSet rset = null;
				
				String sql = prop.getProperty("selectreviewList");
				
				try {
					pstmt = conn.prepareStatement(sql);
					
					int startRow = (pi.getCurrentPage()-1)*pi.getBoardLimit()+1;
					int endRow = startRow +pi.getBoardLimit() -1 ;
					
					pstmt.setInt(1, startRow);
					pstmt.setInt(2, endRow);
					
					rset = pstmt.executeQuery();
			        
					while(rset.next()) {
						 
						list.add(new Review(rset.getInt("REVIEW_NO")
								          ,rset.getString("REVIEW_TITLE")
								          ,rset.getString("MEM_ID")
								          ,rset.getString("D1")
								          ,rset.getInt("REVIEW_COUNT")));					
					}
					
				} catch (SQLException e) {
					e.printStackTrace();
				}finally {
				   
					close(rset);
					close(pstmt);
					
				}
				 return list;	
			}
			
			public ArrayList<Review> selectList2(Connection conn,PageInfo pi){
				
				// SELECT문 => ResultSet 객체 (여러 행 조회) => ArrayList
				
				ArrayList<Review> list = new ArrayList<>();
				
				PreparedStatement pstmt = null;
				ResultSet rset = null;
				
				String sql = prop.getProperty("selectreviewList2");
				
				try {
					pstmt = conn.prepareStatement(sql);
					
					int startRow = (pi.getCurrentPage()-1)*pi.getBoardLimit()+1;
					int endRow = startRow +pi.getBoardLimit() -1 ;
					
					pstmt.setInt(1, startRow);
					pstmt.setInt(2, endRow);
					
					rset = pstmt.executeQuery();
			        
					while(rset.next()) {
						 
						list.add(new Review(rset.getInt("REVIEW_NO")
								          ,rset.getString("REVIEW_TITLE")
								          ,rset.getString("MEM_ID")
								          ,rset.getString("D1")
								          ,rset.getInt("REVIEW_COUNT")));					
					}
					
				} catch (SQLException e) {
					e.printStackTrace();
				}finally {
				   
					close(rset);
					close(pstmt);
					
				}
				 return list;	
			}
			
			//review 상세보기용 
			public Review selectReview(Connection conn,int revNo) {
				
				// SELECT문=> ResultSet객체 (한행 조회)
				
				Review r = null;
				
				PreparedStatement pstmt = null;
				ResultSet rset = null;
				
				String sql = prop.getProperty("selectReview");
				
				try {
					pstmt = conn.prepareStatement(sql);
					
					pstmt.setInt(1, revNo);
					
					rset = pstmt.executeQuery();
					
				    if(rset.next()) {
				    	
				    	r = new Review();
				
				    	r.setRevNo(rset.getInt("REVIEW_NO"));
				    	r.setRevTitle(rset.getString("REVIEW_TITLE"));
				    	r.setUserId(rset.getString("MEM_ID"));
				    	r.setRevDate(rset.getString("D1"));
				    
				    	r.setRevDes(rset.getString("REVIEW_DESCRIPTION"));
				    	r.setRevPath(rset.getString("REVIEW_PHOTO_PATH"));
				    		    	
				    }
					
				} catch (SQLException e) {
					e.printStackTrace();
				}finally {
					close(rset);
					close(pstmt);
				}
				
				return r;	
			}  		
			
			public ArrayList<Review> selectReThumbnailList(Connection conn) {
				// SELECT 문 => ResultSet (여러행) => ArrayList
				
				ArrayList<Review> list = new ArrayList<>();
				
				PreparedStatement pstmt = null;
				ResultSet rset = null;
				
				String sql = prop.getProperty("selectThumbnailList");
				
				try {
					pstmt = conn.prepareStatement(sql);
					
					
					rset = pstmt.executeQuery();
					
					
					while(rset.next()) {
						
						Review r = new Review();
						r.setRevNo(rset.getInt("REVIEW_NO"));
						r.setRevPath(rset.getString("REVIEW_PHOTO_PATH"));
						r.setRevTitle(rset.getString("REVIEW_TITLE"));
						r.setCount(rset.getInt("REVIEW_COUNT"));
						
						
						list.add(r);
					}
					
				} catch (SQLException e) {
				
					e.printStackTrace();
				}finally {
					close(rset);
					close(pstmt);
				}
				return list;		
			}
			public int increaseCount(Connection conn, int revNo) {
				
				// UPDATE 문 => int (처리된 행의 갯수)
				
				int result = 0;
				
				PreparedStatement pstmt = null;
				
				String sql = prop.getProperty("increaseCount");
				
				try {
					pstmt = conn.prepareStatement(sql);
					
					pstmt.setInt(1, revNo);
					
					result = pstmt.executeUpdate();
					
				} catch (SQLException e) {
					e.printStackTrace();
				}finally {
					close(pstmt);
				}	
				return result;		
			}
			
			
			
			
			
			

}
