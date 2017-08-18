defmodule HelloworldWeb.HelloController do
  use HelloworldWeb, :controller

  def index(conn, _params) do
    render(conn, "index.json")
  end
end
