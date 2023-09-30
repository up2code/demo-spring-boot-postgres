# Demo dev container with Spring boot & PostgreSQL

## Prerequisite
- Docker
- Visual Studio Code

## Getting Started
- Open this project with Visual Studio Code.
- Select `Reopen in container` (or `Dev Containers: Reopen in container` via Command Pallete)

## Init test data into Postgres
After container started. Run SQL script in `scripts/init.sql` to initialize test data into Database. 

You can view connection info in `.devcontainer/docker-compose.yml` under service name `db`.


## Run
- Start application by press F5.
- Browse to `http://localhost:8080/books`.