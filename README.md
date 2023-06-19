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
6. connect to kubernetes cluster using CLI and execute command **kubectl apply -f k8s-manifests/** . it will execute all k8s yaml flile in one got and will create deployment,service e.t.c accordingly.
7. verify all created objetc using command **kubectl get all**
8. copy external ip from load balancer service using command **kubectl get svc** and copy external ip value from type= LoadBalancer. same ip will get use as host name in add/retrive data from backend.
9. insert data using below curl

```bash
curl --location 'http://**<external_ip>**/nagp/v1/details' \
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


10. we can get the records using phone number addedd in above curl using below curl
```bash
curl --location 'http://104.198.131.138/nagp/v1/details/**<phone>**' \
--data ''
```

**<phone>** = existing phone number in backend.

