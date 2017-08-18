defmodule HelloworldWeb.Router do
  use HelloworldWeb, :router

  pipeline :api do
    plug :accepts, ["json"]
  end

  scope "/", HelloworldWeb do
    pipe_through :api

    get "/hello", HelloController, :index
  end
end
