package dbSample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnectSample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		//JDBCドライバを読み込む
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// １JDBCドライバが見つからない場合、例外
			e.printStackTrace();
		}
		try {
			
			// ２DBへの接続を行う
			con = DriverManager.getConnection("jdbc:mysql://localhost/home_items",
					"admin", "admin"); //ここがエラー
			
			// ３DB処理のための準備、Statementオブジェクトの作成
			stmt = con.createStatement();
			
			// ４，５Select文の実行と結果を格納／代入
			rs = stmt.executeQuery("select * from category limit 50");
			
			// ６結果を表示する
			while (rs.next()) {
				System.out.println(rs.getString("cate_id") + "：" + rs.getString("Name"));
			}
		} catch (SQLException e) {
			// DBとの処理で何らかのエラーがあった場合の例外
			e.printStackTrace();
		} finally { // 以降は何があっても接続を切断する
			if (rs != null) {
				try {
					rs.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
			}
			if (stmt != null) {
				try {
					stmt.close();
					} catch (SQLException e) {
						e.printStackTrace();
						}
				}
			if (con != null) {
				try {
					con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
			}
		}
	}

}
