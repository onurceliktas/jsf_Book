
package com.DAO;

/**
 *
 * @author onur
 */

import com.pojo.Member;
import java.util.List;


public interface memberDAO {

    public List<Member> readMember();

    public void save(Member member);

    public void delete(Member member);

    public void update(Member member);

}
