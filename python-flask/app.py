from flask import Flask
import json

app = Flask(__name__)

@app.route('/')
def hello():
    return json.dumps({'hello': 'world'})

if __name__ == '__main__':
    app.run()
