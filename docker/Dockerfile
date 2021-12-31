FROM python:3.9.1-slim

WORKDIR /app

COPY requirements.txt .

RUN pip install -r requirements.txt

COPY graphio/ .

