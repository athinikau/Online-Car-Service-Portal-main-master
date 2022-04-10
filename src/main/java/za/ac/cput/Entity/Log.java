/**Entity for the Login
 Author: Athini Mbiko (213196379)

 */

package za.ac.cput.Entity;

public class Log {
    private String userName,passWord;

    private Log(Builder builder){
        this.userName = builder.userName;
        this.passWord = builder.passWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "Log{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
    public static class Builder{
        private String userName,passWord;
        public Builder setuserName(String userName) {
            this.userName = userName;
            return this;
        }

        public Builder setPassWord(String passWord) {
            this.passWord = passWord;
            return this;
        }
        public Builder copy(Log log){
            this.userName = log.userName;
            this.passWord= log.passWord;
            return this;
        }
        public Log builder(){
            return new Log(this);
        }
    }
}
