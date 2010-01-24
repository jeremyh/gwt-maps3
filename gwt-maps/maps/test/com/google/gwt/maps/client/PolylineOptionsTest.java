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

import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for the PolylineOptions class.
 */
public class PolylineOptionsTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.maps.GoogleMapsTest";
  }

  public void testConstructors() {
    assertNotNull("newInstance()", PolylineOptions.newInstance());
  }

  public void testOther() {
    // Unit Test for setPath(MVCArray path)
  }

  public void testProperties() {
    PolylineOptions obj = PolylineOptions.newInstance();
    String strokecolor = "myValue";
    obj.setStrokeColor(strokecolor);
    assertEquals("strokecolor", obj.getStrokeColor(), strokecolor);
    double strokeweight = 600813;
    obj.setStrokeWeight(strokeweight);
    assertEquals("strokeweight", obj.getStrokeWeight(), strokeweight);
    LatLng[] path = new LatLng[]{ LatLng.newInstance(603813, 603813, true) };
    obj.setPath(path);
    assertEquals("path", obj.getPath().length, path.length);
    double strokeopacity = 600813;
    obj.setStrokeOpacity(strokeopacity);
    assertEquals("strokeopacity", obj.getStrokeOpacity(), strokeopacity);
  }
}