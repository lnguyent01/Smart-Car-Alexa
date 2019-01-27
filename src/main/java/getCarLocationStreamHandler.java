///*
//     Copyright 2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
//     Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file
//     except in compliance with the License. A copy of the License is located at
//         http://aws.amazon.com/apache2.0/
//     or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS,
//     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for
//     the specific language governing permissions and limitations under the License.
//*/
//
//import com.amazon.ask.Skill;
//import com.amazon.ask.Skills;
//import com.amazon.ask.SkillStreamHandler;
//import com.amazon.ask.getCarLocation.handlers.CancelandStopIntentHandler;
//import com.amazon.ask.getCarLocation.handlers.carLocationIntentHandler;
//import com.amazon.ask.getCarLocation.handlers.HelpIntentHandler;
//import com.amazon.ask.getCarLocation.handlers.SessionEndedRequestHandler;
//import com.amazon.ask.getCarLocation.handlers.LaunchRequestHandler;
//import com.amazon.ask.getCarLocation.handlers.FallbackIntentHandler;
//import com.mashape.unirest.http.HttpResponse;
//import com.mashape.unirest.http.JsonNode;
//import com.mashape.unirest.http.Unirest;
//
//public class getCarLocationStreamHandler extends SkillStreamHandler {
//
//    private static Skill getSkill() {
//        return Skills.standard()
//                .addRequestHandlers(
//                        new CancelandStopIntentHandler(),
//                        new getCarLocationStreamHandler(),
//                        new HelpIntentHandler(),
//                        new LaunchRequestHandler(),
//                        new SessionEndedRequestHandler(),
//                        new FallbackIntentHandler())
//                // Add your skill id below
//                //.withSkillId("")
//                .build();
//                .withSkillId("amzn1.ask.skill.8dc627d4-1c70-4c6e-b56d-39524afb6e20");
//    }
//
//    class carObj {
//        public String model;
//        public int id;
//
//    }
//
//
//    public getCarLocationHandler() {
//        super(getSkill());
//
//
//        HttpResponse<JsonNode> jsonResponse = Unirest.post("http://httpbin.org/post")
//        .header("accept", "application/json")
//        .queryString("apiKey", "123")
//        .field("parameter", "value")
//        .field("foo", "bar")
//        .asJson();
//    }
//
//}
