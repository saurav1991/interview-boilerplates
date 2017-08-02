const request = require('supertest');
const mocha = require('mocha');

describe('/hello', () => {
  let server;
  beforeEach(() => { server = require('../index') });
  afterEach(() => server.close);

  it('returns JSON', (done) => {
    request(server)
      .get('/hello')
      .expect('Content-Type', /json/)
      .expect({hello: "world"}, done);
  });
});
