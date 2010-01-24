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
 * Tests for the Polygon class.
 */
public class PolygonTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.google.gwt.maps.GoogleMapsTest";
  }

  public void testConstructors() {
    assertNotNull("newInstance()", Polygon.newInstance(null));
  }

  public void testOther() {
    Polygon obj = Polygon.newInstance(null);
    // Unit Test for getPaths()
    assertEquals("getPaths", obj.getPaths(), null);
    // Unit Test for setMap(Map map)
    // Unit Test for setOptions(PolygonOptions options)
    // Unit Test for setPath(LatLng path)
    // Unit Test for setPaths(LatLng paths)
    // Unit Test for setPaths(MVCArray paths)
    // Unit Test for setPaths(MVCArray paths)
    // Unit Test for setPaths(Array<LatLng> paths)
  }

  public void testProperties() {
    Polygon obj = Polygon.newInstance(null);
    MVCArray<LatLng> path = MVCArray.newInstance(null);
    obj.setPath(path);
    assertSame("path", obj.getPath(), path);
  }
}
