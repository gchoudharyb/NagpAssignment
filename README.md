# NagpAssignment
**Description**: Develop and deploy a multi-tier architecture on Kubernetes which involves one
microservices and a database

**language**: Java

**tech**: Spring-boot

**Database**: MySql

## Backend Microservice code repositiory

https://github.com/gchoudharyb/NagpAssignment/tree/4c372a3ce7cf7b740ff0dcad9bbcafcd68bece36/nagp-kube-dev


## K8S Manifest files

https://github.com/gchoudharyb/NagpAssignment/tree/4c372a3ce7cf7b740ff0dcad9bbcafcd68bece36/k8s-manifests


## Steps to deploy and test

1. create Kubernetes clusters
2. check out and do the maven buld for microservice code nagp-kube-dev.
3. create docker image using docker file provided at path https://github.com/gchoudharyb/NagpAssignment/blob/ce412d81c835f2d7d374adf95f86f13adcefc92e/nagp-kube-dev/Dockerfile
4. push created image to docker hub
5. check out kubernets manifest folder form https://github.com/gchoudharyb/NagpAssignment/tree/4c372a3ce7cf7b740ff0dcad9bbcafcd68bece36/k8s-manifests
6. connect to kubernetes cluster using CLI and execute command **kubectl apply -f k8s-manifests/** 

type: Standard
cluster: nagp-public-cluster
Region: us-cenetral1
