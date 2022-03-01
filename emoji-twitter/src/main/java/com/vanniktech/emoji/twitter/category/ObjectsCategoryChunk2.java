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

package com.vanniktech.emoji.twitter.category;

import com.vanniktech.emoji.twitter.TwitterEmoji;

final class ObjectsCategoryChunk2 {
  @SuppressWarnings("PMD.ExcessiveMethodLength") static TwitterEmoji[] get() {
    return new TwitterEmoji[] {
      new TwitterEmoji(0x1FAA5, new String[]{"toothbrush"}, 54, 44, false),
      new TwitterEmoji(0x1F9FD, new String[]{"sponge"}, 54, 5, false),
      new TwitterEmoji(0x1F9EF, new String[]{"fire_extinguisher"}, 53, 51, false),
      new TwitterEmoji(0x1F6D2, new String[]{"shopping_trolley"}, 38, 42, false),
      new TwitterEmoji(0x1F6AC, new String[]{"smoking"}, 37, 8, false),
      new TwitterEmoji(new int[] { 0x26B0, 0xFE0F }, new String[]{"coffin"}, 56, 47, false),
      new TwitterEmoji(0x1FAA6, new String[]{"headstone"}, 54, 45, false),
      new TwitterEmoji(new int[] { 0x26B1, 0xFE0F }, new String[]{"funeral_urn"}, 56, 48, false),
      new TwitterEmoji(0x1F5FF, new String[]{"moyai"}, 32, 51, false),
      new TwitterEmoji(0x1FAA7, new String[]{"placard"}, 54, 46, false)
    };
  }

  private ObjectsCategoryChunk2() {
    // No instances.
  }
}
