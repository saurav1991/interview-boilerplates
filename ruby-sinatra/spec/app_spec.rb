require "spec_helper"

describe MyApp do
  include Rack::Test::Methods

  def app
    MyApp.new
  end

  it "says hi" do
    get "/hello"
    expect(last_response).to be_ok
    expect(last_response.body).to eq('{"hello":"world"}')
  end
end
