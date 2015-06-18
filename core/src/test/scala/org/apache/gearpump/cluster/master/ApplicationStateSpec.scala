/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.gearpump.cluster.master

import org.apache.gearpump.cluster.appmaster.ApplicationState
import org.apache.gearpump.cluster.{AppJar, AppDescription}
import org.scalatest.{BeforeAndAfterEach, Matchers, FlatSpec}

class ApplicationStateSpec  extends FlatSpec with Matchers with BeforeAndAfterEach  {

  "ApplicationState" should "check equal with respect to only appId and attemptId" in {
    val stateA = ApplicationState(0, "application0", 0, null, null, null, "A")
    val stateB = ApplicationState(0, "application0", 0, null, null, null, "B")
    val stateC = ApplicationState(0, "application1", 1, null, null, null, "A")

    assert(stateA == stateB)
    assert(stateA.hashCode == stateB.hashCode)
    assert(stateA != stateC)
  }
}
