# Normally `puts` does not write immediately to STDOUT, but buffers the strings
# internally. Usually it makes more sense to avoid writing every single
# character immediately. However, to help with debugging, you may wish to
# uncomment the below, which tells ruby to flush to STDOUT immediately.
#
# $stdout.sync = true

require './app'
run MyApp
