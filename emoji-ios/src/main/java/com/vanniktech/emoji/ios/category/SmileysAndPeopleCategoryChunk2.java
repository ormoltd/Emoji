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

package com.vanniktech.emoji.ios.category;

import com.vanniktech.emoji.ios.IosEmoji;

final class SmileysAndPeopleCategoryChunk2 {
  @SuppressWarnings("PMD.ExcessiveMethodLength") static IosEmoji[] get() {
    return new IosEmoji[] {
      new IosEmoji(new int[] { 0x1F5E3, 0xFE0F }, new String[]{"speaking_head_in_silhouette"}, 32, 42, false),
      new IosEmoji(0x1F464, new String[]{"bust_in_silhouette"}, 13, 45, false),
      new IosEmoji(0x1F465, new String[]{"busts_in_silhouette"}, 13, 46, false),
      new IosEmoji(0x1FAC2, new String[]{"people_hugging"}, 54, 57, false),
      new IosEmoji(0x1F463, new String[]{"footprints"}, 13, 44, false)
    };
  }

  private SmileysAndPeopleCategoryChunk2() {
    // No instances.
  }
}
