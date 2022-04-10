/**Entity for the Registration
 Author: Athini Mbiko (213196379)

 */

package za.ac.cput.Entity;

public class Registration {
    private String userName,userEmail,addUser,userPassword;
    private int roleID;

    public Registration(Builder builder) {
        this.userName = builder.userName;
        this.userEmail = builder.userEmail;
        this.addUser = builder.addUser;
        this.userPassword= builder.userPassword;
        this.roleID = builder.roleID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getAddUser() {
        return addUser;
    }

    public void setAddUser(String addUser) {
        this.addUser = addUser;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public int getRoleID() {
        return roleID;
    }

    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }
    public static class Builder{
        private String userName,userEmail,addUser,userPassword;
        private int roleID;
        public Builder setuserName(String userName) {
            this.userName = userName;
            return this;

        }
        public Builder setuserEmail(String userEmail) {
            this.userEmail = userEmail;
            return this;

        }
        public Builder setaddUser(String addUser) {
            this.addUser = addUser;
            return this;

        }
        public Builder setuserPassword(String userPassword) {
            this.userPassword = userPassword;
            return this;

        }
        public Builder setroleID(int roleID) {
            this.roleID = roleID;
            return this;

        }
        public Builder copy(Registration registration){
            this.userName = registration.userName;
            this.userEmail = registration.userEmail;
            this.addUser = registration.addUser;
            this.userPassword=registration.userPassword;
            this.roleID = registration.roleID;
            return this;}
        public Registration builder(){
            return new Registration(this);
        }

    }

    @Override
    public String toString() {
        return "Registration{" +
                "userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", addUser='" + addUser + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", roleID=" + roleID +
                '}';
    }
}
