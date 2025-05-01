package BuilderDesign_pratice;

public class Restapi {

    String url;
    String headers;
    String username;

    @Override
    public String toString() {
        return this.url+"|||"+this.headers+"|||"+this.username;
    }

    static class Builder{

        String url;
        String headers;
        String username;



        public Builder setUrl(String url){
            this.url=url;
            return this;
        }
        public Builder setHeaders(String headers){
            this.headers=headers;
            return this;
        }
        public Builder setUsername(String username){
            this.username=username;
            return this;
        }
        public String toString() {
            return "inner nested class"+this.url+"|||"+this.headers+"|||"+this.username;
        }


        public Restapi build(){
            Restapi restapi=new Restapi();
            restapi.url=this.url;
            restapi.headers=this.headers;
            restapi.username=this.username;
            return restapi;
        }

    }
}
