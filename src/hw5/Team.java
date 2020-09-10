package hw5;

import java.util.ArrayList;

public class Team {
    protected Role[] role = new Role[6];
    protected int num = 0;

    public void addMember(Role role) {
        if (num == 6) {
            System.out.println("该队伍成员达到6人，不能继续增加");
        } else {
            this.role[num] = role;
            num++;
        }
    }

    public int attackSum() {
        int sumDamage = 0;
        for (int i = 0; i < num; i++) {
            sumDamage += this.role[i].attack();
        }
        return sumDamage;
    }

    public Role[] getTeam() {
        return this.role;
    }
}
