package dao;

import domain.Users;
import java.util.List;

public interface UsersMapper {
    int insert(Users record);

    List<Users> selectAll();
}