defmodule HelloworldWeb.HelloView do
  use HelloworldWeb, :view

  def render("index.json", _opts) do
    %{hello: "world"}
  end
end
