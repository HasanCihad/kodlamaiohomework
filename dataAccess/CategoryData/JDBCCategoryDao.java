package dataAccess.CategoryData;

import entities.Category;

public class JDBCCategoryDao implements CategoryDao{
    @Override
    public void add(Category category) {
        System.out.println("JDBC ile veritabanına eklendi");
    }
}
