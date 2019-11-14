package com.zhong.flyweight;

/**
 * 享元模式
 * 主要目的是实现对象的共享，即共享池，当系统中对象多的时候可以减少内存的开销
 * 优点：
 * 减少对象的创建，降低内存中对象的数量，降低系统的内存，提高效率
 * 减少内存之外的其他资源占用
 *
 * 缺点：
 * 关注内/外部状态，关注线程安全问题
 * 使系统、程序的逻辑复杂化
 */
public class Test {

    private static final String departments[] = {"RD", "QA", "PM", "DB"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String department = departments[(int) (Math.random() * departments.length)];
            Manager manager = (Manager) EmployeeFactory.getManager(department);
            manager.report();
        }
    }


    /**
     * 数据库连接池代码
     */
//
//    public class ConnectionPool {
//
//        private Vector<Connection> pool;
//
//        /*公有属性*/
//        private String url = "jdbc:mysql://localhost:3306/test";
//        private String username = "root";
//        private String password = "root";
//        private String driverClassName = "com.mysql.jdbc.Driver";
//
//        private int poolSize = 100;
//        private static ConnectionPool instance = null;
//        Connection conn = null;
//
//        /*构造方法，做一些初始化工作*/
//        private ConnectionPool() {
//            pool = new Vector<Connection>(poolSize);
//
//            for (int i = 0; i < poolSize; i++) {
//                try {
//                    Class.forName(driverClassName);
//                    conn = DriverManager.getConnection(url, username, password);
//                    pool.add(conn);
//                } catch (ClassNotFoundException e) {
//                    e.printStackTrace();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//
//        /* 返回连接到连接池 */
//        public synchronized void release() {
//            pool.add(conn);
//        }
//
//        /* 返回连接池中的一个数据库连接 */
//        public synchronized Connection getConnection() {
//            if (pool.size() > 0) {
//                Connection conn = pool.get(0);
//                pool.remove(conn);
//                return conn;
//            } else {
//                return null;
//            }
//        }
//    }
}
