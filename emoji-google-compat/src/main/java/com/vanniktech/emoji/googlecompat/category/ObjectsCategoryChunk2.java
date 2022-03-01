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

final class ObjectsCategoryChunk2 {
  @SuppressWarnings("PMD.ExcessiveMethodLength") static GoogleCompatEmoji[] get() {
    return new GoogleCompatEmoji[] {
      new GoogleCompatEmoji(0x1FAA5, new String[]{"toothbrush"}, false),
      new GoogleCompatEmoji(0x1F9FD, new String[]{"sponge"}, false),
      new GoogleCompatEmoji(0x1F9EF, new String[]{"fire_extinguisher"}, false),
      new GoogleCompatEmoji(0x1F6D2, new String[]{"shopping_trolley"}, false),
      new GoogleCompatEmoji(0x1F6AC, new String[]{"smoking"}, false),
      new GoogleCompatEmoji(new int[] { 0x26B0, 0xFE0F }, new String[]{"coffin"}, false),
      new GoogleCompatEmoji(0x1FAA6, new String[]{"headstone"}, false),
      new GoogleCompatEmoji(new int[] { 0x26B1, 0xFE0F }, new String[]{"funeral_urn"}, false),
      new GoogleCompatEmoji(0x1F5FF, new String[]{"moyai"}, false),
      new GoogleCompatEmoji(0x1FAA7, new String[]{"placard"}, false)
    };
  }

  private ObjectsCategoryChunk2() {
    // No instances.
  }
}
