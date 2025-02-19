package com.wipro.game;

import java.sql.*;

public class Database {
    private Connection conn;

    public Database() {
        try {
            // MySQL connection details
            String url = "jdbc:mysql://localhost:3306/demo"; // MySQL URL
            String user = "root"; // MySQL username
            String password = "Root@123Mysql"; // MySQL password (change as necessary)

            // Create connection
            conn = DriverManager.getConnection(url, user, password);

            // Create table if it doesn't exist
            String createTableSQL = "CREATE TABLE IF NOT EXISTS scores (" +
                    "player_name VARCHAR(255), " +
                    "score INT)";
            Statement stmt = conn.createStatement();
            stmt.execute(createTableSQL);
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateScore(String playerName, int score) {
        try {
            // Check if player exists
            String query = "SELECT * FROM scores WHERE player_name = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, playerName);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                // Update score if player exists
                String updateSQL = "UPDATE scores SET score = ? WHERE player_name = ?";
                pstmt = conn.prepareStatement(updateSQL);
                pstmt.setInt(1, score);
                pstmt.setString(2, playerName);
                pstmt.executeUpdate();
            } else {
                // Insert new score for player
                String insertSQL = "INSERT INTO scores (player_name, score) VALUES (?, ?)";
                pstmt = conn.prepareStatement(insertSQL);
                pstmt.setString(1, playerName);
                pstmt.setInt(2, score);
                pstmt.executeUpdate();
            }

            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void displayScores() {
        try {
            String query = "SELECT player_name, score FROM scores ORDER BY score DESC";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            System.out.println("Player Scores:");
            while (rs.next()) {
                System.out.println(rs.getString("player_name") + ": " + rs.getInt("score"));
            }

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

