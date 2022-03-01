/*
 * Copyright (C) 2016 - Niklas Baudy, Ruben Gees, Mario Đanić and contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.vanniktech.emoji.facebook.category;

import com.vanniktech.emoji.facebook.FacebookEmoji;

final class FoodAndDrinkCategoryChunk1 {
  @SuppressWarnings("PMD.ExcessiveMethodLength") static FacebookEmoji[] get() {
    return new FacebookEmoji[] {
      new FacebookEmoji(0x1F9C3, new String[]{"beverage_box"}, 46, 24, false),
      new FacebookEmoji(0x1F9C9, new String[]{"mate_drink"}, 46, 30, false),
      new FacebookEmoji(0x1F9CA, new String[]{"ice_cube"}, 46, 31, false),
      new FacebookEmoji(0x1F962, new String[]{"chopsticks"}, 43, 58, false),
      new FacebookEmoji(new int[] { 0x1F37D, 0xFE0F }, new String[]{"knife_fork_plate"}, 7, 7, false),
      new FacebookEmoji(0x1F374, new String[]{"fork_and_knife"}, 6, 58, false),
      new FacebookEmoji(0x1F944, new String[]{"spoon"}, 43, 29, false),
      new FacebookEmoji(0x1F52A, new String[]{"hocho", "knife"}, 30, 36, false),
      new FacebookEmoji(0x1F3FA, new String[]{"amphora"}, 10, 50, false)
    };
  }

  private FoodAndDrinkCategoryChunk1() {
    // No instances.
  }
}
