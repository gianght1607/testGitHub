package mytestpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDB {

	public static void main(String[] args) {

		// Thay đổi thông tin kết nối cho phù hợp với cấu hình của bạn
		String jdbcUrl = "jdbc:sqlserver://localhost:1433;databaseName=QLBH;encrypt=false";
		String username = "sa";
		String password = "admin@123";

		try {
			// Kết nối với cơ sở dữ liệu
			Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

			// Thực thi các truy vấn SQL
			Statement statement = connection.createStatement();
			String sql = "Select * from products";
			ResultSet resultSet = statement.executeQuery(sql);

			// Xử lý kết quả truy vấn
			while (resultSet.next()) {
				String column1 = resultSet.getString("name");
				int column2 = resultSet.getInt("id");
				System.out.println(column1 + " - " + column2);
			}

			// Đóng kết nối và các tài nguyên
			resultSet.close();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
