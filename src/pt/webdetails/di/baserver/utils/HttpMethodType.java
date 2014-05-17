/*!
* Copyright 2002 - 2014 Webdetails, a Pentaho company.  All rights reserved.
*
* This software was developed by Webdetails and is provided under the terms
* of the Mozilla Public License, Version 2.0, or any later version. You may not use
* this file except in compliance with the license. If you need a copy of the license,
* please go to  http://mozilla.org/MPL/2.0/. The Initial Developer is Webdetails.
*
* Software distributed under the Mozilla Public License is distributed on an "AS IS"
* basis, WITHOUT WARRANTY OF ANY KIND, either express or  implied. Please refer to
* the license for the specific language governing your rights and limitations.
*/

package pt.webdetails.di.baserver.utils;

/**
 * @author Marco Vala
 */
public enum HttpMethodType {
  GET,
  POST,
  PUT,
  DELETE,
  HEAD,
  OPTIONS

  /*
  private static final String[] names = new String[values().length];

  static {
    HttpMethodType[] types = values();
    for ( int i = 0; i < types.length; i++ ) {
      names[i] = types[i].name();
    }
  }

  public static String[] names() {
    return names;
  }

  public static HttpMethodType getType( String name ) {
    HttpMethodType[] types = values();
    for ( int i = 0; i < types.length; i++ ) {
      if ( types[i].name().equals( name ) ) {
        return types[i];
      }
    }
    return null;
  }
  */
}