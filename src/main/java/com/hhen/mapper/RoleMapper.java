package com.hhen.mapper;

import com.hhen.model.Role;
import com.hhen.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author: imsprojo2Fan
 * @Description:
 * @Date: Created in 9:31 2018/7/2
 * @Modified By:
 */
// @Mapper 这里可以使用@Mapper注解，但是每个mapper都加注解比较麻烦，所以统一配置@MapperScan在扫描路径在application类中
public interface RoleMapper {
	@Select("SELECT * FROM role WHERE id = #{id}")
	User getRoleById(Integer id);

	@Select("SELECT * FROM role")
	public List<User> getRoleList();


	@Insert("insert into role(role) values(#{role})")
	public int add(Role role);

	@Update("UPDATE role SET role = #{role.role}")
	public int update(@Param("id") Integer id, @Param("role") Role role);

	@Delete("DELETE from role where id = #{id} ")
	public int delete(Integer id);
}
