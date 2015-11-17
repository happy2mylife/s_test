package mvcsample.isd.gorin.org.mvcsample.controller;

import java.util.ArrayList;
import java.util.List;

import mvcsample.isd.gorin.org.mvcsample.model.Member;

/**
 * Created by makoto on 2015/09/26.
 */
public class SampleController {

    private List<Member> m_memberList;

    public SampleController() {
        m_memberList = new ArrayList<Member>();
    }

    public void addMember(String name, String hobby){
        m_memberList.add(new Member(m_memberList.size()+1, name, hobby));
    }

    public String getNameById(int id){
        for(Member member : m_memberList){
            if(member.getId() == id){
                return member.getName();
            }
        }

            return "";
    }

    public int getTotalMemberCount(){
        return m_memberList.size();
    }
}
