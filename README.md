# NagpAssignment
**Description**: Develop and deploy a multi-tier architecture on Kubernetes which involves one
microservices and a database

**Language**: Java

**Tech**: Spring-boot

**Database**: MySql

## Backend Microservice code repositiory

[https://github.com/gchoudharyb/NagpAssignment/tree/4c372a3ce7cf7b740ff0dcad9bbcafcd68bece36/nagp-kube-dev](https://github.com/gchoudharyb/NagpAssignment/tree/main/nagp-kube-dev)


## K8S Manifest files

[https://github.com/gchoudharyb/NagpAssignment/tree/4c372a3ce7cf7b740ff0dcad9bbcafcd68bece36/k8s-manifests](https://github.com/gchoudharyb/NagpAssignment/tree/main/k8s-manifests)

## Docker hub URL for Backend microervice image


https://hub.docker.com/repository/docker/gchoudharyb/nagp-kube-dev-assign

**tag**: v3-release

## Steps to deploy and test

1. Create Kubernetes clusters
2. Check out and do the maven buld for microservice code nagp-kube-dev [https://github.com/gchoudharyb/NagpAssignment/tree/eba25c29507bafbe4085c340e7581bcfc9744934/nagp-kube-dev](https://github.com/gchoudharyb/NagpAssignment/tree/main/nagp-kube-dev).
3. Create docker image using docker file provided at path [https://github.com/gchoudharyb/NagpAssignment/blob/ce412d81c835f2d7d374adf95f86f13adcefc92e/nagp-kube-dev/Dockerfile](https://github.com/gchoudharyb/NagpAssignment/blob/main/nagp-kube-dev/Dockerfile)
4. Push created image to docker hub
5. Check out kubernets manifest folder form [https://github.com/gchoudharyb/NagpAssignment/tree/4c372a3ce7cf7b740ff0dcad9bbcafcd68bece36/k8s-manifests](https://github.com/gchoudharyb/NagpAssignment/tree/main/k8s-manifests)
6. Connect to kubernetes cluster using CLI and execute command **kubectl apply -f k8s-manifests/** . it will execute all k8s yaml flile in one go and will create deployment,service e.t.c accordingly.
7. Verify all created objetc using command **kubectl get all**
8. Copy external ip from load balancer service using command **kubectl get svc** and copy external ip value from type= **LoadBalancer**. Ssame ip will get use as host name in add/retrive data from backend service.
9. Add data in backend tier using below curl

```bash
curl --location 'http://<external_ip>/nagp/v1/details' \
--header 'Content-Type: application/json' \
--data-raw '{
    
	"firstName" : "Gaurav",
	 "lastName" : "choudhary",
	 "email" : "t@gmail.com ",
	 "phone" : "9865231403",
	 "companyName" : "info",
	 "designation" : "trainee"
}'
```
**sample curl**
```bash
curl --location 'http://104.198.131.138/nagp/v1/details' \
--header 'Content-Type: application/json' \
--data-raw '{
    
	"firstName" : "Gaurav",
	 "lastName" : "choudhary",
	 "email" : "t@gmail.com ",
	 "phone" : "9865231403",
	 "companyName" : "info",
	 "designation" : "trainee"
}'
```
**<external_ip>** = external ip value from service type= LoadBalancer


10. View the records from backend tier using below curl
```bash
curl --location 'http://<external_ip>/nagp/v1/details/<phone_num>' \
--data ''
```
sample curl:

```bash
curl --location 'http://104.198.131.138/nagp/v1/details/9865231403' \
--data ''
```
**<phone_num>** = external ip value from service type= **LoadBalancer**

