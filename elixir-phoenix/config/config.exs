# This file is responsible for configuring your application
# and its dependencies with the aid of the Mix.Config module.
#
# This configuration file is loaded before any dependency and
# is restricted to this project.
use Mix.Config

# Configures the endpoint
config :helloworld, HelloworldWeb.Endpoint,
  url: [host: "localhost"],
  secret_key_base: "sMTw/k+1apB+1BHyph0WLWnqDT0Gxw0gxxWgDZ+oCinznK61Vyj78m5fJlkE1J1r",
  render_errors: [view: HelloworldWeb.ErrorView, accepts: ~w(json)],
  pubsub: [name: Helloworld.PubSub,
           adapter: Phoenix.PubSub.PG2]

# Configures Elixir's Logger
config :logger, :console,
  format: "$time $metadata[$level] $message\n",
  metadata: [:request_id]

# Import environment specific config. This must remain at the bottom
# of this file so it overrides the configuration defined above.
import_config "#{Mix.env}.exs"
