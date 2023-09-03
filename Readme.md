Kubernetes Learning

1. Created an Application from Spring Initializr
2. Gradle Build ( Generates Jar file of application)
   > gradle clean build
3. Docker Build 
   > docker build -t hubreponame/imagename:tagversion
   > docker build -t gagan2104/kubernetes:1.0 (Pushes the Docker Image from local docker registry to remote docker hub
   > docker images (To see the list of images built locally)
   > docker login (Should authenticate from local to connect to remote docker hub)
   > docker push hubreponame/imagename:tagversion
   > docker push gagan2104/kubernetes:1.0 (Pushes the Docker Image into remote Docker Hub)
   
4. Kubernetes (To deploy images created from above we need a kubernetes cluster so we can create it using kind or from open shift)
   > kind create cluster --name anyname (To create cluster from kind)
   > oc login --token=sha256~K5pXolaxZix2rW3o2sNq3IXBMj9BThcHDHTH4CKYKLU --server=https://api.sandbox-m3.1530.p1.openshiftapps.com:6443 (To connect to a cluster created in open shift)
   > kubectx clustername (To switch from one cluster to another if there are multiple clusters created locally)
   > kubectl run nameofthepod --image hubreponame/imagename:tagversion
   > k run kubernetes --image gagan2104/kubernetes:1.0 (To create a pod in the cluster)
   > k expose po kubernetes --name kubernetessvc --port 8081 (To access the deployed application we have to create a service)


