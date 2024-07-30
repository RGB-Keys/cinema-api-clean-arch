clear-local: ## Remove all container, volumes and dependencies. This action can't be undone
	- $(shell docker-compose down -v --remove-orphans)

remove-local: ## Remove all containers and dependencies
	- $(shell  docker-compose down)

reset-local: ## Remove all containers
	- $(shell docker-compose down && docker-compose up -d && mvn spring-boot:run)

start: ## Run containers and execute default configurations
	- docker-compose up -d

stop: ## Stop containers bu it won1t remove them
	- $(shell docker-compose stop)
