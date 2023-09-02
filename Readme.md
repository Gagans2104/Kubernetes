Kubernetes Learning

1. Created a Application
2. Gradle Build ( Generates Jar file of application)
3. Docker Build - docker build -t gagan2104/kubernetes:1.0 (Pushes the Docker Image into Docker Hub(Local))
4. Docker Push - docker push gagan2104/kubernetes:1.0 (Pushes the Docker Image into Gloabal Docker Hub)
5. Creating a cluster using kind/oc (OC login using token (oc login --token=sha256~K5pXolaxZix2rW3o2sNq3IXBMj9BThcHDHTH4CKYKLU --server=https://api.sandbox-m3.1530.p1.openshiftapps.com:6443
   ))
6. Generating the POD - k run kubernetes --image gagan2104/kubernetes:1.0
7. Expose the application in a server - k expose po kubernetes --name kubernetessvc --port 8081


