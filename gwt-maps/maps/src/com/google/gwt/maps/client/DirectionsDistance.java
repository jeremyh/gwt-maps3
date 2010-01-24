/*
 * Copyright 2009 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.gwt.maps.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * A representation of distance as a numeric value and a display string.
 * {@code <a href="http://code.google.com/apis/maps/documentation/v3/reference.html#DirectionsDistance">JavaScript reference page.</a>}
 */
public class DirectionsDistance extends JavaScriptObject {

  /**
   * Instantiates a DirectionsDistance object.
   * 
   * @return An instance of null
   * 
   * TODO: This class did not have a specified constructor in JavaScript. Consider removing factory method.
   */
  public static native DirectionsDistance newInstance() /*-{
    return new $wnd.DirectionsDistance();
  }-*/;

  protected DirectionsDistance() { }

  /**
   * A string representation of the distance value, using the DirectionsUnitSystem specified in the request.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   */
  public final native String getText() /*-{
    return this.text;
  }-*/;

  /**
   * The distance in meters.
   * 
   * @return 
   * 
   * TODO: Missing comments for return value.
   * TODO: Use type int instead of type double if appropriate.
   */
  public final native double getValue() /*-{
    return this.value;
  }-*/;

  /**
   * A string representation of the distance value, using the DirectionsUnitSystem specified in the request.
   * 
   * @param text
   * 
   * TODO: Missing comments for parameter text.
   */
  public final native void setText(String text) /*-{
    this.text = text;
  }-*/;

  /**
   * The distance in meters.
   * 
   * @param value
   * 
   * TODO: Use type int instead of type double if appropriate.
   * TODO: Missing comments for parameter value.
   */
  public final native void setValue(double value) /*-{
    this.value = value;
  }-*/;

}