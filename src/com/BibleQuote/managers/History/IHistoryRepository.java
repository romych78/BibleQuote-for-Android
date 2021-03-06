/*
 * Copyright (C) 2011 Scripture Software (http://scripturesoftware.org/)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *  @ File Name : IHistoryRepository.java
 *  @ Date : 04.03.2012
 *  @ Author : Vladimir Yakushev
 *  
 */

package com.BibleQuote.managers.history;

import com.BibleQuote.entity.ItemList;
import com.BibleQuote.exceptions.FileAccessException;

import java.util.LinkedList;

public interface IHistoryRepository {
	public void save(LinkedList<ItemList> list);

	public LinkedList<ItemList> load() throws FileAccessException;
}
