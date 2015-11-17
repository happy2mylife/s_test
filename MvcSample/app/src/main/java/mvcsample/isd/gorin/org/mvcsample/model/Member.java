package mvcsample.isd.gorin.org.mvcsample.model;

/**
 * Created by makoto on 2015/09/26.
 */
public class Member {
    private int m_id;
    private String m_name;
    private String hobby;

    public Member(int m_id, String m_name, String hobby) {
        this.m_id = m_id;
        this.m_name = m_name;
        this.hobby = hobby;
    }

    public int getId() {
        return m_id;
    }

    public void setId(int m_id) {
        this.m_id = m_id;
    }

    public String getName() {
        return m_name;
    }

    public void setName(String m_name) {
        this.m_name = m_name;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
