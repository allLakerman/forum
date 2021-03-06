package com.forum.model.entity

import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = 'f_follow_friend')
class FollowFriendEntity implements Serializable{
    String sid
    String friendSid
    String oper

    String getOper() {
        return oper
    }

    void setOper(String oper) {
        this.oper = oper
    }

    String getSid() {
        return sid
    }

    void setSid(String sid) {
        this.sid = sid
    }

    String getFriendSid() {
        return friendSid
    }

    void setFriendSid(String friendSid) {
        this.friendSid = friendSid
    }
}
