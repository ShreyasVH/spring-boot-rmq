FROM maven:3.5.2-jdk-8-alpine
WORKDIR /app/
RUN apk update && apk add vim && apk add lsof
COPY . .
EXPOSE 8072 9072
ENTRYPOINT ["sh", "./start.sh"]