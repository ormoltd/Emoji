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

package com.vanniktech.emoji.googlecompat.category;

import com.vanniktech.emoji.googlecompat.GoogleCompatEmoji;

final class FoodAndDrinkCategoryChunk1 {
  @SuppressWarnings("PMD.ExcessiveMethodLength") static GoogleCompatEmoji[] get() {
    return new GoogleCompatEmoji[] {
      new GoogleCompatEmoji(0x1F9C3, new String[]{"beverage_box"}, false),
      new GoogleCompatEmoji(0x1F9C9, new String[]{"mate_drink"}, false),
      new GoogleCompatEmoji(0x1F9CA, new String[]{"ice_cube"}, false),
      new GoogleCompatEmoji(0x1F962, new String[]{"chopsticks"}, false),
      new GoogleCompatEmoji(new int[] { 0x1F37D, 0xFE0F }, new String[]{"knife_fork_plate"}, false),
      new GoogleCompatEmoji(0x1F374, new String[]{"fork_and_knife"}, false),
      new GoogleCompatEmoji(0x1F944, new String[]{"spoon"}, false),
      new GoogleCompatEmoji(0x1F52A, new String[]{"hocho", "knife"}, false),
      new GoogleCompatEmoji(0x1F3FA, new String[]{"amphora"}, false)
    };
  }

  private FoodAndDrinkCategoryChunk1() {
    // No instances.
  }
}
