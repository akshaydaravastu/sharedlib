def call(filepath){ 
   def version_filetype=filepath.split("/")[-1]
   def version=version_filetype.split("-")[0]
   def filetype=version_filetype.split("-")[1]
   def group_name=filepath.split("/")[-2]
  echo "group is ${group_name} \n versioning is ${version} \n type is ${filetype}"  
  
}

