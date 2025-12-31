package com.project.pastebin.repository;

import org.springframework.data.repository.CrudRepository;

import com.project.pastebin.entity.Paste;

public interface PasteRepository extends CrudRepository<Paste, String> {

}