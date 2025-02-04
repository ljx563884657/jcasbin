// Copyright 2020 The casbin Authors. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.casbin.jcasbin.main;

import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import static org.casbin.jcasbin.main.TestUtil.testDomainEnforce;

public class GroupRoleManagerTest {
    @Test
    public void testGroupRoleManager() {
        Enforcer e = new Enforcer("examples/group_with_domain_model.conf", "examples/group_with_domain_policy.csv");
        testDomainEnforce(e, "alice", "domain1", "data1", "read", false);
    }


    @Test
    public void testGroupRoleManager2() {
        Enforcer e = new Enforcer("examples/group_with_domain_model.conf", "examples/group_with_domain_policy.csv");
        testDomainEnforce(e, "alice", "domain1", "data1", "read", false);
        String s = "hello";
        byte[] bytes = s.getBytes();
        System.out.println(Arrays.toString("hello".getBytes(StandardCharsets.UTF_8)));
    }


}
