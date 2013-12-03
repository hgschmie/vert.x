/*
 * Copyright (c) 2011-2013 The original author or authors
 * ------------------------------------------------------
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 *     The Eclipse Public License is available at
 *     http://www.eclipse.org/legal/epl-v10.html
 *
 *     The Apache License v2.0 is available at
 *     http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */
package org.vertx.java.core.http;

/**
 * @author <a href="mailto:nmaurer@redhat.com">Norman Maurer</a>
 */
public final class HttpHeaders {

  public static final CharSequence ACCEPT = io.netty.handler.codec.http.HttpHeaders.Names.ACCEPT;
  public static final CharSequence ACCEPT_CHARSET = io.netty.handler.codec.http.HttpHeaders.Names.ACCEPT_CHARSET;
  public static final CharSequence ACCEPT_ENCODING = io.netty.handler.codec.http.HttpHeaders.Names.ACCEPT_ENCODING;
  public static final CharSequence ACCEPT_LANGUAGE = io.netty.handler.codec.http.HttpHeaders.Names.ACCEPT_LANGUAGE;
  public static final CharSequence ACCEPT_RANGES = io.netty.handler.codec.http.HttpHeaders.Names.ACCEPT_RANGES;
  public static final CharSequence ACCEPT_PATCH = io.netty.handler.codec.http.HttpHeaders.Names.ACCEPT_PATCH;
  public static final CharSequence ACCESS_CONTROL_ALLOW_CREDENTIALS = io.netty.handler.codec.http.HttpHeaders.Names.ACCESS_CONTROL_ALLOW_CREDENTIALS;
  public static final CharSequence ACCESS_CONTROL_ALLOW_HEADERS = io.netty.handler.codec.http.HttpHeaders.Names.ACCESS_CONTROL_ALLOW_HEADERS;
  public static final CharSequence ACCESS_CONTROL_ALLOW_METHODS = io.netty.handler.codec.http.HttpHeaders.Names.ACCESS_CONTROL_ALLOW_METHODS;
  public static final CharSequence ACCESS_CONTROL_ALLOW_ORIGIN = io.netty.handler.codec.http.HttpHeaders.Names.ACCESS_CONTROL_ALLOW_ORIGIN;
  public static final CharSequence ACCESS_CONTROL_EXPOSE_HEADERS = io.netty.handler.codec.http.HttpHeaders.Names.ACCESS_CONTROL_EXPOSE_HEADERS;
  public static final CharSequence ACCESS_CONTROL_MAX_AGE = io.netty.handler.codec.http.HttpHeaders.Names.ACCESS_CONTROL_MAX_AGE;
  public static final CharSequence ACCESS_CONTROL_REQUEST_HEADERS = io.netty.handler.codec.http.HttpHeaders.Names.ACCESS_CONTROL_REQUEST_HEADERS;
  public static final CharSequence ACCESS_CONTROL_REQUEST_METHOD = io.netty.handler.codec.http.HttpHeaders.Names.ACCESS_CONTROL_REQUEST_METHOD;
  public static final CharSequence AGE = io.netty.handler.codec.http.HttpHeaders.Names.AGE;
  public static final CharSequence ALLOW = io.netty.handler.codec.http.HttpHeaders.Names.ALLOW;
  public static final CharSequence AUTHORIZATION = io.netty.handler.codec.http.HttpHeaders.Names.AUTHORIZATION;
  public static final CharSequence CACHE_CONTROL = io.netty.handler.codec.http.HttpHeaders.Names.CACHE_CONTROL;
  public static final CharSequence CONNECTION = io.netty.handler.codec.http.HttpHeaders.Names.CONNECTION;
  public static final CharSequence CONTENT_BASE = io.netty.handler.codec.http.HttpHeaders.Names.CONTENT_BASE;
  public static final CharSequence CONTENT_ENCODING = io.netty.handler.codec.http.HttpHeaders.Names.CONTENT_ENCODING;
  public static final CharSequence CONTENT_LANGUAGE = io.netty.handler.codec.http.HttpHeaders.Names.CONTENT_LANGUAGE;
  public static final CharSequence CONTENT_LENGTH = io.netty.handler.codec.http.HttpHeaders.Names.CONTENT_LENGTH;
  public static final CharSequence CONTENT_LOCATION = io.netty.handler.codec.http.HttpHeaders.Names.CONTENT_LOCATION;
  public static final CharSequence CONTENT_TRANSFER_ENCODING = io.netty.handler.codec.http.HttpHeaders.Names.CONTENT_TRANSFER_ENCODING;
  public static final CharSequence CONTENT_MD5 = io.netty.handler.codec.http.HttpHeaders.Names.CONTENT_MD5;
  public static final CharSequence CONTENT_RANGE = io.netty.handler.codec.http.HttpHeaders.Names.CONTENT_RANGE;
  public static final CharSequence CONTENT_TYPE = io.netty.handler.codec.http.HttpHeaders.Names.CONTENT_TYPE;
  public static final CharSequence COOKIE = io.netty.handler.codec.http.HttpHeaders.Names.COOKIE;
  public static final CharSequence DATE = io.netty.handler.codec.http.HttpHeaders.Names.DATE;
  public static final CharSequence ETAG = io.netty.handler.codec.http.HttpHeaders.Names.ETAG;
  public static final CharSequence EXPECT = io.netty.handler.codec.http.HttpHeaders.Names.EXPECT;
  public static final CharSequence EXPIRES = io.netty.handler.codec.http.HttpHeaders.Names.EXPIRES;
  public static final CharSequence FROM = io.netty.handler.codec.http.HttpHeaders.Names.FROM;
  public static final CharSequence HOST = io.netty.handler.codec.http.HttpHeaders.Names.HOST;
  public static final CharSequence IF_MATCH = io.netty.handler.codec.http.HttpHeaders.Names.IF_MATCH;
  public static final CharSequence IF_MODIFIED_SINCE = io.netty.handler.codec.http.HttpHeaders.Names.IF_MODIFIED_SINCE;
  public static final CharSequence IF_NONE_MATCH = io.netty.handler.codec.http.HttpHeaders.Names.IF_NONE_MATCH;
  public static final CharSequence LAST_MODIFIED = io.netty.handler.codec.http.HttpHeaders.Names.LAST_MODIFIED;
  public static final CharSequence LOCATION = io.netty.handler.codec.http.HttpHeaders.Names.LOCATION;
  public static final CharSequence ORIGIN = io.netty.handler.codec.http.HttpHeaders.Names.ORIGIN;
  public static final CharSequence PROXY_AUTHENTICATE = io.netty.handler.codec.http.HttpHeaders.Names.PROXY_AUTHENTICATE;
  public static final CharSequence PROXY_AUTHORIZATION = io.netty.handler.codec.http.HttpHeaders.Names.PROXY_AUTHORIZATION;
  public static final CharSequence REFERER = io.netty.handler.codec.http.HttpHeaders.Names.REFERER;
  public static final CharSequence RETRY_AFTER = io.netty.handler.codec.http.HttpHeaders.Names.RETRY_AFTER;
  public static final CharSequence SERVER = io.netty.handler.codec.http.HttpHeaders.Names.SERVER;
  public static final CharSequence TRANSFER_ENCODING = io.netty.handler.codec.http.HttpHeaders.Names.TRANSFER_ENCODING;
  public static final CharSequence UPGRADE = io.netty.handler.codec.http.HttpHeaders.Names.UPGRADE;
  public static final CharSequence USER_AGENT = io.netty.handler.codec.http.HttpHeaders.Names.USER_AGENT;


  public static CharSequence createOptimized(String value) {
    return io.netty.handler.codec.http.HttpHeaders.newEntity(value);
  }

  private HttpHeaders() {
  }
}
