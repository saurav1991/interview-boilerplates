require "sinatra"
require "json"

class MyApp < Sinatra::Base
  get "/hello" do
    { hello: "world" }.to_json
  end
end
