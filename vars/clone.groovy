def call(String Giturl, String Gitbranch){
  echo "Cloning the code from Git Hub"
  git url: "${Giturl}", branch: "${Gitbranch}"
  echo "Code clone successful"
}
