minikube delete

minikube start

mvn clean install -Dmaven.test.skip=true

docker build -t core-svc core-svc/.
docker build -t notification-svc notification-svc/.

minikube image build -t core-svc core-svc/.
minikube image build -t notification-svc notification-svc/.

kubectl apply -f notification-svc/notification-svc.deployment.service.yaml

kubectl apply -f core-svc/core-svc.configmap.yaml

kubectl apply -f core-svc/core-svc.deployment.service.yaml
