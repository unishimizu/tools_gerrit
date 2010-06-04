// Copyright (C) 2010 The Android Open Source Project
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.gerrit.server;

import junit.framework.TestCase;

public class ChangeUtilTest extends TestCase {

  public void testInvertSortKey() {
    assertEquals("ffffffffffffffff", ChangeUtil
        .invertSortKey("0000000000000000"));

    assertEquals("0000000000000001", ChangeUtil
        .invertSortKey("fffffffffffffffe"));

    assertEquals("0001600000000000", ChangeUtil
        .invertSortKey("fffe9fffffffffff"));

    assertEquals("/", ChangeUtil.invertSortKey("z"));

    assertEquals("z", ChangeUtil.invertSortKey("/"));
  }

}
