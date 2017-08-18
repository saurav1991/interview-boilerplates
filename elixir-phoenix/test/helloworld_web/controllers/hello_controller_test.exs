defmodule HelloworldWeb.HelloControllerTest do
  use HelloworldWeb.ConnCase

  test "#index returns a hello world" do
    conn = build_conn()
    conn = get conn, hello_path(conn, :index)

    assert json_response(conn, 200) == %{
      "hello" => "world"
    }
  end
end
